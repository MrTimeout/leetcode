#include <iostream>
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

Node* insert(Node* node, int val) {
    if (node == nullptr) return new Node(val);
    else {
        Node* cur;
        if (val <= node->val) {
            cur = insert(node->left, val);
            node->left = cur;
        } else {
            cur = insert(node->right, val);
            node->right = cur;
        }
        return node;
    }
}

void printAllTree(Node* node) {
    printf("%d ", node->val);
    if (node->left != nullptr) printAllTree(node->left);
    if (node->right != nullptr) printAllTree(node->right);
}

void inorder(Node* node) {
    if (node == nullptr) return;
    inorder(node->left);
    printf("%d ", node->val);
    inorder(node->right);
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
    inorder(node);
    return 0;
}
