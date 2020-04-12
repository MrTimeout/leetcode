#include <stdio.h>
#include <stdlib.h>
#include <math.h>

struct triangle
{
	int a;
	int b;
	int c;
};

typedef struct triangle triangle;

int area(triangle* tr) {
    float p = (tr->a + tr->b + tr->c) / 2.0;
    return p * (p - tr->a) * (p - tr->b) * (p - tr->c);
}

void sort_by_area(triangle* tr, int n) {
	int* d = (int*) malloc(n * sizeof(int));
    for (int i = 0; i < n; i++) {
        *(d + i) = area(tr + i);
    }
    //buble sort
    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (*(d + j) > *(d + j + 1)) {
                
                (*(tr + j)).a ^= (*(tr + j + 1)).a;
                (*(tr + j + 1)).a ^= (*(tr + j)).a;
                (*(tr + j)).a ^= (*(tr + j + 1)).a;

                (*(tr + j)).b ^= (*(tr + j + 1)).b;
                (*(tr + j + 1)).b ^= (*(tr + j)).b;
                (*(tr + j)).b ^= (*(tr + j + 1)).b;
                
                (*(tr + j)).c ^= (*(tr + j + 1)).c;
                (*(tr + j + 1)).c ^= (*(tr + j)).c;
                (*(tr + j)).c ^= (*(tr + j + 1)).c;
                
                (*(d + j)) ^= (*(d + j + 1));
                (*(d + j + 1)) ^= (*(d + j));
                (*(d + j)) ^= (*(d + j + 1));
            }
        }
    }
}

int main()
{
	int n;
	scanf("%d", &n);
	triangle *tr = malloc(n * sizeof(triangle));
	for (int i = 0; i < n; i++) {
		scanf("%d%d%d", &tr[i].a, &tr[i].b, &tr[i].c);
	}
	sort_by_area(tr, n);
	for (int i = 0; i < n; i++) {
		printf("%d %d %d\n", tr[i].a, tr[i].b, tr[i].c);
	}
	return 0;
}
