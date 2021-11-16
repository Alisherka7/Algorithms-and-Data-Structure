# Stack
A  s tack is a linear data structure that follows the priciple of Last In First Out(LIFO). <br>
![изображение](https://user-images.githubusercontent.com/38793933/142063100-3362eb6a-78cb-4b71-9d56-882755da7f8b.png)

 
Push: Add an element to the top of a stack<br>
Pop: Remove an element from the top of a stack<br>
IsEmpty: Check if the stack is empty<br>
IsFull: Check if the stack is full<br>
Peek: Get the value of the top element without removing it<br>

### Working of Stack Data Structure<br>
1. A pointer called TOP is used to keep track of the top element in the stack.<br>
2. When intializing the stack, we set its value to -1 so that we can check if the stack is empty by comparing TOP == -1<br>
3. On pushing an element, we increase the value of TOP and place the new element in the position pointed to by TOP.<br>
4. On popping an element, we return the element pointed to by TOP and reduce its value.<br>
5. Before pushing, we check if the stack is already full<br>
6. Before popping, we check if the stack is already empty<br>
![изображение](https://user-images.githubusercontent.com/38793933/142063117-2b6a50d4-8859-4706-9319-a7332390ca5c.png)

 
