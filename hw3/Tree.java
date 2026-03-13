package aisd.hw3;

public class Tree<T extends Comparable<T>> {
    private TreeNode<T> root;
    private int size;
    private int height;

    //todo: реализовать в домашке
    // private int height;

    //todo: чтобы быстро создать конструктор или геттеры\сеттеры
    // можно нажать комбинацию клавиш alt + insert (на Mac -- cmd + n)

    public Tree() {
        this.height = 0;
    }

    public Tree(TreeNode<T> root) {
        this.root = root;
        this.height = 1;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }
    public TreeNode<T> getRoot() {
        return root;
    }



    public void add(T value) {
        TreeNode<T> node = new TreeNode<>(value);

        if (this.root == null) {
            this.root = node;
//            this.height = 1;
        } else {
            add(this.root, value);
        }
        size++;
    }

    private void add(TreeNode<T> current, T value) {
        if (current.getValue().compareTo(value) > 0) {
            if (current.getLeft() == null) {
                current.setLeft(new TreeNode<>(value));
            } else {
                add(current.getLeft(), value);
            }
        } else if (current.getValue().compareTo(value) <= 0) {
            if (current.getRight() == null) {
                current.setRight(new TreeNode<>(value));
            } else {
                add(current.getRight(), value);
            }
        }
    }

    public void preOrder() {
        preOrder(this.root);
    }
    private void preOrder(TreeNode<T> current) {
        if (current == null) {
            return;
        } else {
            System.out.println(current.getValue());
            preOrder(current.getLeft());
            preOrder(current.getRight());
        }
    }
    public void inOrder() {
        preOrder(this.root);
    }
    private void inOrder(TreeNode<T> current) {
        if (current == null) {
            return;
        } else {
            preOrder(current.getLeft());
            System.out.println(current.getValue());
            preOrder(current.getRight());
        }
    }
    public void postOrder() {
        postOrder(this.root);
    }
    private void postOrder(TreeNode<T> current) {
        if (current == null) {
            return;
        } else {
            postOrder(current.getLeft());
            postOrder(current.getRight());
            System.out.println(current.getValue());
        }
    }
}