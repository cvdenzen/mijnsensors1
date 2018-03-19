package nl.vandenzen.mijnsensors1.json;

// From Pilight

import org.apache.camel.model.dataformat.JsonDataFormat;

public class JsonReceiverResponse extends JsonDataFormat {
    public Message message;
    public String origin;
    public String protocol;
    public String uuid;
    public Integer repeats;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getRepeats() {
        return repeats;
    }

    public void setRepeats(Integer repeats) {
        this.repeats = repeats;
    }

    public class Message {
        public Integer id;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getUnit() {
            return unit;
        }

        public void setUnit(Integer unit) {
            this.unit = unit;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
        public Integer unit;
        public String state;
    }


}
