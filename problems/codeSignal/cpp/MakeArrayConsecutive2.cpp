int makeArrayConsecutive2(std::vector<int> statues) {
    std::sort(statues.begin(), statues.end());
    int size = statues.size();
    int x = 0;
    for (std::vector<int>::size_type i = 0; i < size-1; i++) {
        if (statues.at(i) + 1 != statues.at(i+1)) x += statues.at(i+1) - statues.at(i) - 1;
    }
    return x;
}
