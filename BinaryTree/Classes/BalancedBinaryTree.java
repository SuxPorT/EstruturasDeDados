package BinaryTree.Classes;

public class BalancedBinaryTree {
    public Node root;

    public BalancedBinaryTree() {
        this.root = null;
    }

    // Métodos auxiliares
    private boolean empty() {
        return this.root == null;
    }

    private int balance(Node root) {
        return this.height(root.getLeft()) - this.height(root.getRight());
    }

    private void rightRotate(Node node, Node parent) {
        Node newNode = node.getLeft(), temporary = newNode.getRight();

        newNode.setRight(node);
        node.setLeft(temporary);

        if (parent == null) {
            this.root = newNode;
        }
        else {
            parent.setRight(newNode);
        }
    }

    private void leftRotate(Node node, Node parent) {
        Node newNode = node.getRight(), temporary = newNode.getLeft();

        newNode.setLeft(node);
        node.setRight(temporary);

        if (parent == null) {
            this.root = newNode;
        }
        else {
            parent.setLeft(newNode);
        }
    }

    private void rotate(Node root) {
        int firstBalance = this.balance(root), secondBalance;

        if (firstBalance == -2) {
            secondBalance = this.balance(root.getRight());

            if (secondBalance == 1) {
                this.rightRotate(root.getRight(), root);
            }

            this.leftRotate(root, null);
        }
        else if (firstBalance == 2) {
            secondBalance = this.balance(root.getLeft());

            if (secondBalance == -1) {
                this.leftRotate(root.getLeft(), root);
            }

            this.rightRotate(root, null);
        }
    }

    // Métodos privados
    private void insert(Node root, int element) {
        if (element < root.getInformation()) {
            if (root.getLeft() == null) {
                root.setLeft(new Node(element));
            }
            else {
                this.insert(root.getLeft(), element);
            }
        }
        else {
            if (root.getRight() == null) {
                root.setRight(new Node(element));
            }
            else {
                this.insert(root.getRight(), element);
            }
        }

        this.rotate(root);
    }

    private Node biggest(Node root) {
        Node node = root.getRight();

        if (node != null) {
            if (node.getRight() == null) {
                if (node.getLeft() == null) {
                    root.setRight(null);
                }
                else {
                    root.setRight(node.getLeft());
                }

                return node;
            }

            return this.biggest(node);
        }

        return root;
    }

    private Node smallest(Node root) {
        Node node = root.getLeft();

        if (node != null) {
            if (node.getLeft() == null) {
                if (node.getRight() == null) {
                    root.setLeft(null);
                }
                else {
                    root.setLeft(node.getRight());
                }

                return node;
            }

            return this.smallest(node);
        }

        return null;
    }

    private Node remove(Node node, Node parent, int element) {
        if (node != null) {
            if (node.getInformation() != element) {
                if (element >= node.getInformation()) {
                    return this.remove(node.getRight(), node, element);
                }

                return this.remove(node.getLeft(), node, element);
            }
            else {
                boolean rightNode = node.getInformation() >= parent.getInformation();

                if (node.getLeft() == null && node.getRight() == null) {
                    if (rightNode) {
                        parent.setRight(null);
                    }
                    else {
                        parent.setLeft(null);
                    }
                }
                else if (node.getLeft() == null && node.getRight() != null) {
                    if (rightNode) {
                        parent.setRight(node.getRight());
                    }
                    else {
                        parent.setLeft(node.getRight());
                    }
                }
                else if (node.getLeft() != null && node.getRight() == null) {
                    if (rightNode) {
                        parent.setRight(node.getLeft());
                    }
                    else {
                        parent.setLeft(node.getLeft());
                    }
                }
                else {
                    Node biggest = this.biggest(node.getRight());

                    if (rightNode) {
                        parent.setRight(biggest);
                    }
                    else {
                        parent.setLeft(biggest);
                    }

                    biggest.setLeft(node.getLeft());
                }

                this.rotate(parent);

                return node;
            }
        }

        return null;
    }

    private boolean search(Node root, int element) {
        if (root != null) {
            if (root.getInformation() != element) {
                if (element > root.getInformation()) {
                    return this.search(root.getRight(), element);
                }

                return this.search(root.getLeft(), element);
            }

            return true;
        }

        return false;
    }

    private void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.getInformation() + " ");
            this.preOrder(root.getLeft());
            this.preOrder(root.getRight());
        }
    }

    private void inOrder(Node root) {
        if (root != null) {
            this.inOrder(root.getLeft());
            System.out.print(root.getInformation() + " ");
            this.inOrder(root.getRight());
        }
    }

    private void posOrder(Node root) {
        if (root != null) {
            this.posOrder(root.getLeft());
            this.posOrder(root.getRight());
            System.out.print(root.getInformation() + " ");
        }
    }

    private int height(Node root) {
        if (root == null) {
            return -1;
        }

        int leftHeight = this.height(root.getLeft());
        int rightHeight = this.height(root.getRight());

        if (leftHeight > rightHeight) {
            return 1 + leftHeight;
        }

        return 1 + rightHeight;
    }

    // Métodos públicos
    public void insert(int element) {
        if (this.empty()) {
            this.root = new Node(element);
        }
        else {
            this.insert(this.root, element);
        }
    }

    public Node biggest() {
        if (!this.empty()) {
            if (this.root.getRight() == null) {
                Node node = this.root;
                this.root = this.root.getLeft();

                return node;
            }

            return this.biggest(this.root);
        }

        return null;
    }

    public Node smallest() {
        if (!this.empty()) {
            if (this.root.getLeft() == null) {
                Node node = this.root;
                this.root = this.root.getRight();

                return node;
            }

            return this.smallest(this.root);
        }

        return null;
    }

    public Node remove(int element) {
        if (!this.empty()) {
            Node node = this.root;

            if (this.root.getInformation() != element) {
                return this.remove(node, null, element);
            }
            else {
                if (node.getLeft() == null && node.getRight() == null) {
                    this.root = null;

                    return node;
                }
                else if (node.getLeft() == null && node.getRight() != null) {
                    if (element >= node.getRight().getInformation()) {
                        this.root = this.root.getRight();

                        return node;
                    }
                }
                else if (node.getLeft() != null && node.getRight() == null) {
                    if (element < node.getLeft().getInformation()) {
                        this.root = this.root.getLeft();

                        return node;
                    }
                }
                else {
                    if (element >= node.getRight().getInformation()) {
                        return this.remove(node.getRight(), node, element);
                    }
                    else {
                        return this.remove(node.getLeft(), node, element);
                    }
                }

                return null;
            }
        }

        return null;
    }

    public boolean search(int element) {
        return this.search(this.root, element);
    }

    public void preOrder() {
        this.preOrder(this.root);
    }

    public void inOrder() {
        this.inOrder(this.root);
    }

    public void posOrder() {
        this.posOrder(this.root);
    }

    public int height() {
        return this.height(this.root);
    }
}