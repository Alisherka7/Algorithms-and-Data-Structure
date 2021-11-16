class Stack  {
    private int arr[];
    private int top;
    private int capacity;

    // Creating a stack
    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Utitilty function to return the size of the stack
    public int size(){
        return top + 1;
    }

    // check if the stack is empty
    public Boolean isEmpty(){
        return top == -1;
    }
    // Check if the stack is full
    public Boolean isFull(){
        return top == capacity -1;
    }


    // Add elements into stack
    public void push(int x){
        if(isFull()){
            System.out.println("Stack is full");
            System.exit(1);
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }


    // Return and remove element from stack
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            System.exit(1);
        }
        return arr[top--];
    } 
    public void printStack(){
        for(int i = 0; i<=top; i++){
            System.out.println(arr[i]);
        }
    }
}
