  public List<Integer> common(int[] a, int[] b, int[] c){
	  List<Integer> result = new ArrayList<Integer>();
	  int i = 0; 
	  int j = 0; 
	  int k = 0;
	  while( i < a.length && j < b.length && k < c.length){
		  if(a[i] == b[j] && b[j] == c[k]){
			  result.add(a[i]);
			  i++;
			  j++;
			  k++;
		  }else if( a[i] <= b[j] && a[i] <= c[k]){
			  i++;
		  }else if( b[j] <= a[i] && b[j] <= c[k]){
			  j++;
		  }else{
			  k++;
		  }
	  }
	  
	  return result;
  }
