package TJobsheet9;

public class StackSurat10 {
    Surat10[] stack;
    int top;
    int size;

    public StackSurat10(int size) {
        this.size = size;
        stack = new Surat10[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat10 surat) {
        if (!isFull()) {
            stack[++top] = surat;
            System.out.println("Surat berhasil diterima.");
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat baru.");
        }
    }

    public Surat10 pop() {
        if (!isEmpty()) {
            Surat10 surat = stack[top--];
            System.out.println("Surat berhasil diproses.");
            return surat;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat10 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat.");
            return null;
        }
    }

    public Surat10 cariSurat(String namaMahasiswa) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                return stack[i];
            }
        }
        return null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
        } else {
            for (int i = top; i >= 0; i--) {
                Surat10 s = stack[i];
                System.out.println(s.idSurat + " | " + s.namaMahasiswa + " | " + s.kelas + " | " + s.jenisIzin + " | " + s.durasi);
            }
        }
    }
}
