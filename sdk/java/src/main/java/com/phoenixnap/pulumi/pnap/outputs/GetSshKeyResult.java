// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSshKeyResult {
    /**
     * @return Keys marked as default are always included on server creation and reset unless toggled off in creation/reset request.
     * 
     */
    private Boolean default_;
    /**
     * @return The unique identifier of the SSH Key.
     * 
     */
    private String id;
    /**
     * @return SSH Key value.
     * 
     */
    private String key;
    /**
     * @return Friendly SSH key name to represent an SSH key.
     * 
     */
    private String name;

    private GetSshKeyResult() {}
    /**
     * @return Keys marked as default are always included on server creation and reset unless toggled off in creation/reset request.
     * 
     */
    public Boolean default_() {
        return this.default_;
    }
    /**
     * @return The unique identifier of the SSH Key.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return SSH Key value.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Friendly SSH key name to represent an SSH key.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSshKeyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean default_;
        private String id;
        private String key;
        private String name;
        public Builder() {}
        public Builder(GetSshKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.id = defaults.id;
    	      this.key = defaults.key;
    	      this.name = defaults.name;
        }

        @CustomType.Setter("default")
        public Builder default_(Boolean default_) {
            if (default_ == null) {
              throw new MissingRequiredPropertyException("GetSshKeyResult", "default_");
            }
            this.default_ = default_;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSshKeyResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("GetSshKeyResult", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSshKeyResult", "name");
            }
            this.name = name;
            return this;
        }
        public GetSshKeyResult build() {
            final var _resultValue = new GetSshKeyResult();
            _resultValue.default_ = default_;
            _resultValue.id = id;
            _resultValue.key = key;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
