import java.util.Stack;

public class nextGreaterElem {

    public static void nextGreat(int[] arr) {
        Stack<Integer> s = new Stack<>();
    
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.empty() && s.peek() <= arr[i]) {
                s.pop();
            }
    
            if (s.empty()) {
                System.err.print("-1 ");
            } else {
                System.err.print(s.peek()+" ");
            }
    
            s.push(arr[i]);
        }
    }
    



    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3 };
        // nextGreat(arr);

        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }else{
                nxtGreater[i] = arr[s.peek()];
            }

            s.push(i);
        }

        for(int i=0;i<nxtGreater.length;i++){
            System.err.print(nxtGreater[i]+" ");
        }
    }
}
