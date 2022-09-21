class LinearPractice{
  public static void main (String[] args){
     linearSearch([1,2,3,4,5,6], 3);
  }

  public static int linearSearch(int[] data, int key) {
        for(int index = 0; index < data.length; index++) {
            if (data[index] == key) {
                return index;
            }
        }

        return -1;
    }

  //Javascript
//   function linearSearch(array, key){
//   for(let i = 0; i < array.length; i++){
//     if(array[i] === key) {
//         return i;
//     }
//   }
//   return -1;
// }

//python
// def linear_search(lst, target):
//     for index, value in enumerate(lst):
//         if value == target:
//             return index
//     return -1





//php

// function linearSearch(Array $list, $key)
// {
//     $count = count($list);

//     for ($i = 0; $i < $count; $i++;) {
//         if ($list[$i] == $key) {
//             return $i;
//         }
//     }

//     return -1;
// }   
}