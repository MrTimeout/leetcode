#include <stdio.h>

using namespace std;

class Node {
    public:
        int val;
        Node* left;
        Node* right;
        Node (int v) {
            val = v;
            left = nullptr;
            right = nullptr;
        }
};

int max(int a, int b) {
    return a > b ? a : b;
}

Node* insert(Node* root, int val) {
    if (root == nullptr) return new Node(val);
    else {
        Node* cur;
        if (val <= root->val) {
            cur = insert(root->left, val);
            root->left = cur;
        } else {
            cur = insert(root->right, val);
            root->right = cur;
        }
        return root;
    }
}

int height(Node* node) {
    if (node == nullptr) return 0;
    return 1 + max(height(node->left), height(node->right));
}

int diameter(Node* node) {
    if (node == nullptr) return 0;
    int l = height(node->left);
    int r = height(node->right);
    int dl = diameter(node->left); 
    int dr = diameter(node->right);
    return max(1+l+r, max(dl, dr));
}

int main(void) {
    int n;
    scanf("%d", &n);
    Node* node = nullptr;
    while (n-- > 0) {
        int temp;
        scanf("%d", &temp);
        node = insert(node, temp);
    }
    int result = height(node);
    int d = diameter(node);
    printf("%d %d", result, d);
    return 0;
}
