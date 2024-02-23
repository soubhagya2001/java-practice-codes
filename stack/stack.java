import java.util.ArrayList;

public class stack{
    static class stack1{
        static ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty(){
            return list.size() == 0;
        }

        //push
        public void push(int data){
            list.add(data);
        }

        //pop
        public int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public int peek(){
            return list.get(list.size()-1);
        }
    }

    public static void main(String args[]){
        stack1 s = new stack1();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.err.println(s.peek());
            s.pop();
        }
    }
}