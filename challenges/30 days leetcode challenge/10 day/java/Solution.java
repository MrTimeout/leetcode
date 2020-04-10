class MinStack {
  
    private List<Map.Entry<Integer, Integer>> l;

    /** initialize your data structure here. */
    public MinStack() {
      l = new ArrayList<Map.Entry<Integer, Integer>>();
    }
    
    public void push(int x) {
      l.add(new java.util.AbstractMap.SimpleEntry<Integer,Integer>(x, setMin(x)));
    }
    
    public void pop() {
      if (!l.isEmpty()) {
        l.remove(l.size()-1);
      }
    }
    
    public int top() {
      if (!l.isEmpty()) return l.get(l.size()-1).getKey();
      return 0;
    }
  
    private int setMin(int x) {
      if (l.isEmpty()) return x;
      return x <= l.get(l.size()-1).getValue() ? x : l.get(l.size()-1).getValue();
    }
    
    public int getMin() {
        return l.get(l.size()-1).getValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
