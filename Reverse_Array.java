 public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
            
            int f=0,l=a.size()-1;
            while(f<l)
            {
                int temp=a.get(f);
                a.set(f,a.get(l));
                a.set(l,temp);
                f++;
                l--;
            }
            return a;
    }
