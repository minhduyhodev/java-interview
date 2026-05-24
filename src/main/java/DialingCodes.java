import java.util.Map;
import java.util.HashMap;

public class DialingCodes {
    private Map<Integer, String> code;

    public DialingCodes() {
        this.code = new HashMap<>();
    }

    public Map<Integer, String> getCodes() {
        return this.code;
    }

    public void setDialingCode(Integer code, String country) {
        this.code.put(code, country);
    }

    public String getCountry(Integer code) {
        return this.code.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (this.code.containsKey(code) || this.code.containsValue(country))
            return;
        this.code.put(code, country);

    }

    public Integer findDialingCode(String country) {
        for (Map.Entry<Integer, String> entry : this.code.entrySet()) {
            if (entry.getValue().equals(country)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if (!this.code.containsValue(country)) {
            return;
        }
        Integer oldCode = null;
        for (Map.Entry<Integer, String> entry : this.code.entrySet()) {
            if (entry.getValue().equals(country)) {
                oldCode = entry.getKey();
                break;
            }
        }
        if (oldCode != null) {
            this.code.remove(oldCode);
            this.code.put(code, country);
        }
    }
}
