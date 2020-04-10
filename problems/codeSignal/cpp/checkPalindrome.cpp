bool checkPalindrome(std::string s) {
    for (std::string::size_type i = 0; i < s.size()/2; ++i) {
        if (s[i] != s[s.size()-1-i]) {
            return false;
        }
    }
    return true;
}
