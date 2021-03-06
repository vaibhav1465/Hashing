// count distant numbers
       HashSet<Integer> h=new HashSet<Integer>();
       for (i = 0; i < n; i++)
           h.add(a[i]) ;
       System.out.println(h.size());

..............................................
  // frequency of each element
      HashMap<Integer,Integer> h=new HashMap<>();
        for(i=0;i<n;i++){
            if(h.containsKey(a[i]))
            {
                int t=h.get(a[i]);
                h.replace(a[i],t,t+1);

            }
            else{
                h.put(a[i],1);
            }
        }
        System.out.println(h);


