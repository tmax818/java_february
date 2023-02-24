
class ListNode {
    constructor(data){
        this.data = data;
        this.next = null;

    }
}


class SinglyLinkedList{

    constructor(){
        this.head = null;
    }

    isEmpty(){
        // if(!this.head) { 
        //     return true
        // } else {
        //     return false
        // }
        return !this.head
        } 
    /**
     * Reverses this list in-place without using any extra lists.
 * - Time: (?).
 * - Space: (?).
 * @returns {SinglyLinkedList} This list.
    */
   reverse() {
        if(this.isEmpty() || this.head.next === null){
            return this
        }

        let temp = this.head
        let temp2 = this.head.next
        temp.next = null
        this.head = temp2
        temp2.next = temp


   }
   
   /**
    * Determines whether the list has a loop in it which would result in
    * infinitely traversing unless otherwise avoided. A loop is when a node's
    * next points to a node that is behind it.
    * - Time: (?).
    * - Space: (?).
    * @returns {boolean} Whether the list has a loop or not.
   */
  hasLoop() {}
  
  /**
   * Removes all the nodes that have a negative integer as their data.
   * - Time: (?).
   * - Space: (?).
   * @returns {SinglyLinkedList} This list after the negatives are removed.
  */
 removeNegatives() {}
}

const ourSLL = new SinglyLinkedList();
// console.log(ourSLL.isEmpty())
ourSLL.head = new ListNode(35)
// console.log(ourSLL.isEmpty())
ourSLL.head.next = new ListNode(3)
console.log("before", ourSLL)
ourSLL.reverse()
// ourSLL.head.next.next = new ListNode(13)
console.log("after", ourSLL.head.data)
// console.log(ourSLL.head.next.next)