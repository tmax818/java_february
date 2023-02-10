class Node {

    constructor(data) {
      this.data = data;
      this.next = null;
    }
  }

  class SinglyLinkedList {
    constructor() {
      this.head = null;
    }
  
    /**
     * @returns {boolean}
     */
    isEmpty() {
        return this.head === null;
    }
  
    /**
     * Creates a new node with the given data and inserts it at the back of
     * this list.
     * @param {any} data The data to be added to the new node.
     * @returns {SinglyLinkedList} This list.
     */
    insertAtBack(data) {
        const newBack = new Node(data);
    
        if (this.isEmpty()) {
          this.head = newBack;
          return this;
        }
    
        let runner = this.head;
    
        while (runner.next !== null) {
          runner = runner.next;
        }
    
        runner.next = newBack;
        return this;
      }
  
    /**
     * Creates a new node with the given data and inserts it at the back of
     * this list.
     * @param {any} data The data to be added to the new node.
     * @param {?ListNode} runner The current node during the traversal of this list
     *    or null when the end of the list has been reached.
     * @returns {SinglyLinkedList} This list.
     */
    insertAtBackRecursive(data, runner = this.head) {}
  
    /**
     * Calls insertAtBack on each item of the given array.
     * @param {Array<any>} vals The data for each new node.
     * @returns {SinglyLinkedList} This list.
     */
    insertAtBackMany(vals) {
      for (const item of vals) {
        this.insertAtBack(item);
      }
      return this;
    }
  
    /**
     * Converts this list into an array containing the data of each node.
     * @returns {Array<any>} An array of each node's data.
     */
    toArr() {
      const arr = [];
      let runner = this.head;
  
      while (runner) {
        arr.push(runner.data);
        runner = runner.next;
      }
      return arr;
    }

    insertAtFront(data) {
        const newHead = new Node(data) 
        newHead.next = this.head
        this.head = newHead
        return this;
    }

    removeHead(){
        if(this.isEmpty()){
            return null;
        }
        const oldHead = this.head
        this.head = oldHead.next
        return oldHead.data


    }
}

const sll = new SinglyLinkedList();
sll.insertAtBack(1)
sll.insertAtBack(2)
sll.insertAtFront(0)
console.log(sll.removeHead())

console.log(sll)
