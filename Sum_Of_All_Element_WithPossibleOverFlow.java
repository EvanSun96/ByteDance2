//数组整体的和是不会溢出的，但是其中若干个元素的和可能溢出（正数+负数绝对不会溢出，因此将数组原地分为正数区、负数区两部分，然后左右双指针求和）

//既然整体的和不会溢出，而若干元素之和可能溢出
//那么我们就先算肯定不会溢出的，什么肯定不会溢出呢？一个正数加一个负数，所有我们把所有数字分区，分为正数区和负数区，然后
//用左右双指针来一对一对的相加。
//这样的话我们就能生成一个新的数组，数组里的所有元素都不会溢出
//如果这里面全部都是正数的话，因为每个元素不会溢出，而且所有元素相加也不会溢出，所以就直接将所有元素相加即可。
//如果这里面含有负数的话，那么就还是分为正数负数区，左右双指针相加，之后就一直重复这个过程，直到数组中没有负数。

//其实可以这样做：把数组分为正数和负数区，先把负数区全部加起来，然后再一个一个的和正数区的元素相加 直到为正，这个时候整个数组就全为正的了。然后再相加即可
//然而这样是不对的，无论你是想把全部转换成正数还是负数，把那一半的正数或者把那一半的负数加起来都是有可能超限的
