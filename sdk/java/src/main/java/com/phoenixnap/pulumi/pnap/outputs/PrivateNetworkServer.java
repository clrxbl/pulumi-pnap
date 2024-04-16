// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateNetworkServer {
    /**
     * @return The server identifier.
     * 
     */
    private @Nullable String id;
    /**
     * @return List of public IPs associated to the resource.
     * 
     */
    private @Nullable List<String> ips;

    private PrivateNetworkServer() {}
    /**
     * @return The server identifier.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return List of public IPs associated to the resource.
     * 
     */
    public List<String> ips() {
        return this.ips == null ? List.of() : this.ips;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateNetworkServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private @Nullable List<String> ips;
        public Builder() {}
        public Builder(PrivateNetworkServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ips = defaults.ips;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ips(@Nullable List<String> ips) {

            this.ips = ips;
            return this;
        }
        public Builder ips(String... ips) {
            return ips(List.of(ips));
        }
        public PrivateNetworkServer build() {
            final var _resultValue = new PrivateNetworkServer();
            _resultValue.id = id;
            _resultValue.ips = ips;
            return _resultValue;
        }
    }
}