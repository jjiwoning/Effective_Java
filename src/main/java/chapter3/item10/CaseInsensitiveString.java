package chapter3.item10;

import java.util.Objects;

public final class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s){
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof CaseInsensitiveString)
            //equalsIgnoreCase : 대소문자 구분x
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        if(o instanceof String) // 한방향으로만 작동한다.
            return s.equalsIgnoreCase((String) o);
        return false;
    }
}
