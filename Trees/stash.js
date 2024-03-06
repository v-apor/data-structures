// Recursive approach
// function depthFirstSearch(root) {
//   if (root === null) return [];
//   const leftValues = depthFirstSearch(root.left);
//   const rightValues = depthFirstSearch(root.right);
//   return [root.val, ...leftValues, ...rightValues];
// }
