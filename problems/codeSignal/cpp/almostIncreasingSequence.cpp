bool almostIncreasingSequence(std::vector<int> sequence) {
    if (sequence.size() <= 2) return true;
    int size = sequence.size();
    int cont = sequence.at(0) >= sequence.at(1) ? 1 : 0;
    int x = 1;
    for (int i = 1; i < size-1; i++) {
        if (sequence.at(x) >= sequence.at(i+1)) {
            if (sequence.at(x-1) < sequence.at(i+1)) x = i+1;
            cont++;
            if (cont > 1) break;
        } else {
            x = i+1;
        }
    }
    return cont <= 1;
}
