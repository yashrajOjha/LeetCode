The idea is to modify the array in-place as you walk through it, while also preserving the original array elements.


We know that all elements are positive initially. When we see k = | A[i] | for the first time, multiply A[k] by -1. The negative sign on index k indicates k has been seen once. As you progress through the array, you will find some j > i such that A[j] = k. Now when you look at A[k], it is already negative (seen once). Thus j is a duplicate add it to the array.

