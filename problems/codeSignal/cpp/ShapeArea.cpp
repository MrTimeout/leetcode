int shapeArea(int n) {
    int a = n*2 -1;
    for (int i = a-2; i > 0; i-=2) a += i*2;
    return a;
}
