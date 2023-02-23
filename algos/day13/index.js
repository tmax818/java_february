
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

    
    /**
     * Reverses this list in-place without using any extra lists.
 * - Time: (?).
 * - Space: (?).
 * @returns {SinglyLinkedList} This list.
    */
   reverse() {}
   
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