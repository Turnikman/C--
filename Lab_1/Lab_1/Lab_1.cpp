#include "stdafx.h"
#include <iostream>
using namespace std;

int _tmain(int argc, _TCHAR* argv[])
{
	int* ptd;
	int size2 = 128 * 128 * 128; //2 mb
	int size4 = 128 * 128 * 256; //4 mb
	int size8 = 128 * 256 * 256; //8 mb
	int size16 = 256 * 256 * 256; //16 mb
	int size32 = 256 * 256 * 512; //32 mb
	int size64 = 256 * 512 * 512; //64 mb
	int size128 = 512 * 512 * 512; //128 mb
	int size256 = 512 * 512 * 1024; //256 mb
	int size512 = 512 * 1024 * 1024; //512 mb
	int size1024 = 1024 * 1024 * 1024; //1024 mb
	int size = 2048 * 2048 * 2048; //1024 mb not allocated

	ptd = (int *)malloc(size1024);
	if (ptd != NULL)
	{
		for (int i = 0; i < 10; i++)
			ptd[i] = i;
		cout << "allocated";
		getchar();
	}
	else printf("not allocated");
	free(ptd);
	return 0;
}