public class StringBehaviour {
    public static void main(String[] args){
        String s1="Hello";
        String s5="Hello";
        String s2=s1;
        s1=s1+"world";
        System.out.println("Original string: "+s1);
        System.out.println("Copy string: "+s2);
        System.out.println("Are s1 and s2 same object:"+(s1==s2));
        System.out.println("Comparing string literals s2 and s5 using == \n");
        System.out.println("Are s2 and s5 same object:"+(s2==s5));
        System.out.println("Comparing string literals s2 and s5 using .equals() \n");
        if(s2.equals(s5))
            System.out.println("Both s2 and s5 are equal");
        else
            System.out.println("Both s2 and s5 are not equal");

        String s3=new String("Rheya");
        String s4=new String("Rheya");
        System.out.println("Comparing string objects s3 and s4 using == \n");
        System.out.println("Are s3 and s4 same object:"+(s3==s4));
        System.out.println("Comparing string objects s3 and s4 using .equals() \n");
        if(s3.equals(s4))
            System.out.println("Both s3 and s4 are equal");
        else
            System.out.println("Both s3 and s4 are not equal");

        String p="b";
        System.out.println("String value before concatenating string literal 1000 times: "+p);
        long start,end;
        start=System.nanoTime();
        for(int i=0;i<1000;i++){
            p=p+"a";
        }
        end=System.nanoTime();
        System.out.println("String value after concatenating  string literal 1000 times: "+p+"\n Time taken: "+(end-start));

        long start1,end1;
        start1=System.nanoTime();
        StringBuilder sb=new StringBuilder(p);
        for(int i=0;i<1000;i++){
            sb.append("a");
        }
        end1=System.nanoTime();
        System.out.println("String value after concatenating using StringBuilder 1000 times: "+p+"\n Time taken: "+(end1-start1));


    }
}
