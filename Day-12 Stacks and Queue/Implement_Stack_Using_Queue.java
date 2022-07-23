class MyStack {
 Queue<Integer> q = new LinkedList<Integer>();
   Queue<Integer> queue1;
    Queue<Integer> queue2;
    private int top;//

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue1.offer(x);
        top = x;//
    }

    public int pop() {
        while (queue1.size() > 1) {//1
            top = queue1.poll();//toptop
            queue2.add(top);
        }
        //12
        Queue<Integer> tmp = queue2;
        queue2 = queue1;
        queue1 = tmp;
        return queue2.poll();//22
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return queue1.isEmpty();//1
    }
}
