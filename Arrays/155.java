class MinStack {
    private ArrayList<Integer> min_list;
    private ArrayList<Integer> stack;

    public MinStack() {
        this.min_list = new ArrayList<Integer>();
        this.stack = new ArrayList<Integer>();
    }
    
    public void push(int val) {
        if (this.min_list.size() == 0 || val <= this.min_list.get(this.min_list.size()-1)) {
            this.min_list.add(val);
        }
        this.stack.add(val);
    }
    
    public void pop() {
        if ((Integer.compare(this.min_list.get(this.min_list.size()-1), this.stack.get(this.stack.size()-1)) == 0)) {
            this.min_list.remove(this.min_list.size()-1);
        }
        this.stack.remove(this.stack.size()-1);
    }
    
    public int top() {
        return this.stack.get(this.stack.size()-1);
    }
    
    public int getMin() {
        if (this.min_list.size() != 0) {
            return this.min_list.get(this.min_list.size()-1);
        }
        return 0;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */