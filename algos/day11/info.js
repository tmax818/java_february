/**
 * BFS order: horizontal rows top-down left-to-right.
 * Converts this BST into an array following Breadth First Search order.
 * Example on the fullTree var:
 * [25, 15, 50, 10, 22, 35, 70, 4, 12, 18, 24, 31, 44, 66, 90]
 * @param {Node} current The current node during the traversal of this tree.
 * @returns {Array<number>} The data of all nodes in BFS order.
 */
toArrLevelorder(current = this.root) {}

/**
 * Recursively counts the total number of nodes in this tree.
 * - Time: O(?).
 * - Space: O(?).
 * @param {Node} node The current node during the traversal of this tree.
 * @returns {number} The total number of nodes.
 */
size(node = this.root) {}

/**
 * Calculates the height of the tree which is based on how many nodes from
 * top to bottom (whichever side is taller).
 * - Time: O(?).
 * - Space: O(?).
 * @param {Node} node The current node during traversal of this tree.
 * @returns {number} The height of the tree.
 */
height(node = this.root) {}

/**
 * Determines if this tree is a full tree. A full tree is a tree where every
 * node has both a left and a right except for the leaf nodes (last nodes)
 * - Time: O(?).
 * - Space: O(?).
 * @param {Node} node The current node during traversal of this tree.
 * @returns {boolean} Indicates if this tree is full.
 */
isFull(node = this.root) {}