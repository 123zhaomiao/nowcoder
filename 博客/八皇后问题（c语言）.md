   八皇后问题，是一个古老而著名的问题，是回溯算法的典型案例。该问题是国际西洋棋棋手马克斯·贝瑟尔于1848年提出:在8×8格的国际象棋上摆放八个皇后，使其不能互相攻击，即任意两个皇后都不能处于同一行、同一列或同一斜线上，问有多少种摆法。 
代码如下：

```java
#include<stdio.h>
#include<stdlib.h>
#define N 10
char arr[N][N];
struct Pos
{
	int xpos; //列偏移量
	int ypos; //行偏移量
}p[3] = { { -1, -1 }, { 0 ,-1 }, {1,-1 } };
//初始化数组
void Init()
{
	int i = 0;
	for (i = 0; i < N; i++)
	{
		int j = 0;
		for (j = 0; j < N; j++)
		{
			arr[i][j] = ' ';
			//边框设置为#
			arr[0][j] = '#';       
			arr[N - 1][j] = '#';
			arr[i][0] = '#';
			arr[i][N - 1] = '#';
		}
	}
}
//展示数组
void Show()
{
	int i = 0;
	for (i = 0; i < N; i++)
	{
		int j = 0;
		for (j = 0; j < N; j++)
		{
			printf("%c ", arr[i][j]);
		}
		printf("\n");
	}
}
//检查是否可以摆放
int check_put( int row, int col)
{
	int i;
	int ret = 1;
	int nr = row;
	int nc = col;
	for (i = 0; ret&&i < 3; i++)   //需要判断两个对角线以及上方是否有皇后
	{
		nr = row;
		nc = col;
		while ((arr[nr][nc] != '#')&&ret) //循环到边缘截止
		{
			if (arr[nr][nc] == ' ')      //判断这个位置是否有皇后
			{
				nr = nr + p[i].ypos;     
				nc = nc + p[i].xpos;
			}
			else
				ret = 0;
		}	
	}
	return ret;
}
//摆皇后
void Find(int row)
{
	int j = 0;
	static int count = 0;   //用于计算摆皇后有多少种情况
	if (row > N - 2)        //摆完1-8行后打印
	{
		Show();
		count++;
		printf("count=%d\n", count);
	}
	else
	{
		for (j = 1; j < N - 1; j++)
		{
			if (check_put(row, j))  //判断是否可以放皇后，如果可以返回1；
			{
				arr[row][j] = '*';  //将此位置放上皇后
				Find( row + 1);     //递归摆下一行
				arr[row][j] = ' ';
			}
		}
	}
}
int main()
{
	//初始化数组  
	Init();
	//摆皇后
	Find(1);
	system("pause");
	return 0;
}
```
代码解析：

 - 要放置八个皇后，就需要8*8列的棋盘，但是为了方便期间，我们把棋盘设置为10 *10列，最外圈赋值为#，里面赋为空格。
 - 接着进入摆皇后函数，第一个这个函数的参数为1，即行号为1，先判断第一行是否可以摆放皇后，如果可以摆放将*赋给这个位置，接着递归判断下一行是否可以摆放，如果可以，递归第三行，如果不可以，返回到上一行，将上一行的皇后消除重新摆放后接着找其他的位置摆放皇后，设置一个静态变量用于计数。
 - 判断是否可以摆放，如下图所示只需要判断1，2，3直线处的各个位置是否有皇后，如果都没有，则可以摆放，如果任意一个地方有皇后或者遇到边缘#，则不可以摆放。由坐标特点得，我们可以设置一个结构体数组，用于存放棋盘的左右偏移量，1号线的偏移量为（-1，-1），2号线的偏移量为（0，-1），3号线的偏移量为（1，-1）其中第一个参数为列偏移量，第二个参数为行偏移量。
 ![这里写图片描述](https://img-blog.csdn.net/20180520194734401?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3poYW9fbWlhbw==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
 
 代码运行部分截屏：
 ![这里写图片描述](https://img-blog.csdn.net/20180520194512500?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3poYW9fbWlhbw==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

