public class StackTugasMahasiswa10 {
    Mahasiswa10[] stack;
    int top;
    int size;

public StackTugasMahasiswa10(int size) {
    this.size = size;
    stack = new Mahasiswa10[size];
    top = -1;
}
public boolean isFull() {
    if (top == size - 1) {
        return true;
    } else {
        return false;
    }
}
public boolean isEmpty() {
    if (top == -1) {
        return true;
    } else {
        return false;
    }
}
public void push(Mahasiswa10 mhs) {
    if (!isFull()) {
        top++;
        stack[top] = mhs;
    } else {
        System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi");
    }
}
public Mahasiswa10 pop() {
    if (!isEmpty()) {
        Mahasiswa10 m = stack[top];
        top--;
        return m;
    } else {
        System.out.println("Stack kosong! Tidak ada tugas untuk dinilai");
        return null;
    }
}
public Mahasiswa10 peek() {
    if (!isEmpty()) {
        return stack[top];
    } else {
        System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
        return null;
    }
}
public Mahasiswa10 bottom() {
    if (!isEmpty()) {
        return stack[0];
    } else {
        System.out.println("Stack kosong! Tidak ada tugas . ");
        return null;
    }
}
public int jumlahTugas() {
    return top + 1;
}
public void print(){
    for (int i = 0; i <= top; i++) {
        System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
    }
    System.out.println("");
}
}