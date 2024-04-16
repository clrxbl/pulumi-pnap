// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRancherClusterMetadata {
    /**
     * @return The Rancher Server URL.
     * 
     */
    private String url;

    private GetRancherClusterMetadata() {}
    /**
     * @return The Rancher Server URL.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRancherClusterMetadata defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String url;
        public Builder() {}
        public Builder(GetRancherClusterMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetRancherClusterMetadata", "url");
            }
            this.url = url;
            return this;
        }
        public GetRancherClusterMetadata build() {
            final var _resultValue = new GetRancherClusterMetadata();
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
