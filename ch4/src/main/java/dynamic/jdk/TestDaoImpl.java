package dynamic.jdk;

public class TestDaoImpl implements TestDao {
    @Override
    public void save() {
        System.out.println("执行保存");
    }

    @Override
    public void modify() {
        System.out.println("执行修改");

    }

    @Override
    public void delete() {
        System.out.println("执行删除");

    }
}
