int adjacentElementsProduct(std::vector<int> a) {
    int max = INT_MIN, temp;
    for (std::size_t i = 0; i < a.size()-1; i++) {
        if ((temp = a.at(i) * a.at(i+1)) > max) max = temp;
    }
    return max;
}
