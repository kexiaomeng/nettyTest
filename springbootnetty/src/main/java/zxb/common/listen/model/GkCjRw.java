package zxb.common.listen.model;

import java.util.Objects;

public class GkCjRw {
    private int cjmbBh;
    private String cjmbMc;

    public int getCjmbBh() {
        return cjmbBh;
    }

    public void setCjmbBh(int cjmbBh) {
        this.cjmbBh = cjmbBh;
    }

    public String getCjmbMc() {
        return cjmbMc;
    }

    public void setCjmbMc(String cjmbMc) {
        this.cjmbMc = cjmbMc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GkCjRw gkCjRw = (GkCjRw) o;
        return cjmbBh == gkCjRw.cjmbBh &&
                Objects.equals(cjmbMc, gkCjRw.cjmbMc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cjmbBh, cjmbMc);
    }
}
