
//////////////// ! TUESDAY //////////////////////////

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
        if(this.head === null){
            return true
        } else {
            return false
        }
    }
  
    /**
     * Creates a new node with the given data and inserts it at the back of
     * this list.
     * @param {any} data The data to be added to the new node.
     * @returns {SinglyLinkedList} This list.
     */
    insertAtBack(data) {
        let runner = this.head
        while(runner !== null ){
            runner = runner.next;
            console.log(runner)
        }
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
//////////////! WEDNESDAY //////////////////////
/**  Creates a new node with the given data and inserts that node at the front
 * of this list.
 * @param {any} data The data for the new node.
 * @returns {SinglyLinkedList} This list.
 */
insertAtFront(data) {}

/**
 * Removes the first node of this list.
 * @returns {any} The data from the removed node.
 */
removeHead() {}

// EXTRA
/**
 * Calculates the average of this list.
 * @returns {number|NaN} The average of the node's data.
 */
average() {}

//////////////! THURSDAY ////////////////

/**
 * Removes the last node of this list.
 * @returns {any} The data from the node that was removed.
 */
removeBack() {}

/**
 * Determines whether or not the given search value exists in this list.
 * @param {any} val The data to search for in the nodes of this list.
 * @returns {boolean}
 */
contains(val) {}

/**
 * Determines whether or not the given search value exists in this list.
 * @param {any} val The data to search for in the nodes of this list.
 * @param {?ListNode} current The current node during the traversal of this list
 *    or null when the end of the list has been reached.
 * @returns {boolean}
 */
containsRecursive(val, current = this.head) {}

// EXTRA
/**
 * Recursively finds the maximum integer data of the nodes in this list.
 * @param {ListNode} runner The start or current node during traversal, or null
 *    when the end of the list is reached.
 * @param {ListNode} maxNode Keeps track of the node that contains the current
 *    max integer as it's data.
 * @returns {?number} The max int or null if none.
 */
recursiveMax(runner = this.head, maxNode = this.head) {}

///! FRIDAY //////////////////////////////

/**
 * Retrieves the data of the second to last node in this list.
 * @returns {any} The data of the second to last node or null if there is no
 *    second to last node.
 */
secondToLast() {}

/**
 * Removes the node that has the matching given val as it's data.
 * @param {any} val The value to compare to the node's data to find the
 *    node to be removed.
 * @returns {boolean} Indicates if a node was removed or not.
 */
removeVal(val) {}

// EXTRA
/**
 * Inserts a new node before a node that has the given value as its data.
 * @param {any} newVal The value to use for the new node that is being added.
 * @param {any} targetVal The value to use to find the node that the newVal
 *    should be inserted in front of.
 * @returns {boolean} To indicate whether the node was pre-pended or not.
 */
prepend(newVal, targetVal) {}

  }
  
  /******************************************************************* 
  Multiple test lists already constructed to test your methods on.
  Below commented code depends on insertAtBack method to be completed,
  after completing it, uncomment the code.
  */
  const emptyList = new SinglyLinkedList();
  
  // const singleNodeList = new SinglyLinkedList().insertAtBackMany([1]);
  // const biNodeList = new SinglyLinkedList().insertAtBackMany([1, 2]);
  // const firstThreeList = new SinglyLinkedList().insertAtBackMany([1, 2, 3]);
  // const secondThreeList = new SinglyLinkedList().insertAtBackMany([4, 5, 6]);
  // const unorderedList = new SinglyLinkedList().insertAtBackMany([
    //   -5, -10, 4, -3, 6, 1, -7, -2,
    // ]);
    
    /* node 4 connects to node 1, back to head */
    // const perfectLoopList = new SinglyLinkedList().insertAtBackMany([1, 2, 3, 4]);
    // perfectLoopList.head.next.next.next = perfectLoopList.head;
    
    /* node 4 connects to node 2 */
    // const loopList = new SinglyLinkedList().insertAtBackMany([1, 2, 3, 4]);
    // loopList.head.next.next.next = loopList.head.next;
    
    // const sortedDupeList = new SinglyLinkedList().insertAtBackMany([
      //   1, 1, 1, 2, 3, 3, 4, 5, 5,
      // ]);
      
      // Print your list like so:
      // console.log(firstThreeList.toArr());
const SLL = new SinglyLinkedList();
let node1 = new Node(1)
let node2 = new Node(2)

node1.next = node2
SLL.head = node1

console.log(SLL, node1, node2)