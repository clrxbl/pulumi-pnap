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
public final class PublicNetworkMembership {
    /**
     * @return List of public IPs associated to the resource.
     * 
     */
    private @Nullable List<String> ips;
    /**
     * @return The resource identifier.
     * 
     */
    private @Nullable String resourceId;
    /**
     * @return The resource&#39;s type.
     * 
     */
    private @Nullable String resourceType;

    private PublicNetworkMembership() {}
    /**
     * @return List of public IPs associated to the resource.
     * 
     */
    public List<String> ips() {
        return this.ips == null ? List.of() : this.ips;
    }
    /**
     * @return The resource identifier.
     * 
     */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * @return The resource&#39;s type.
     * 
     */
    public Optional<String> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicNetworkMembership defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> ips;
        private @Nullable String resourceId;
        private @Nullable String resourceType;
        public Builder() {}
        public Builder(PublicNetworkMembership defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ips = defaults.ips;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceType = defaults.resourceType;
        }

        @CustomType.Setter
        public Builder ips(@Nullable List<String> ips) {

            this.ips = ips;
            return this;
        }
        public Builder ips(String... ips) {
            return ips(List.of(ips));
        }
        @CustomType.Setter
        public Builder resourceId(@Nullable String resourceId) {

            this.resourceId = resourceId;
            return this;
        }
        @CustomType.Setter
        public Builder resourceType(@Nullable String resourceType) {

            this.resourceType = resourceType;
            return this;
        }
        public PublicNetworkMembership build() {
            final var _resultValue = new PublicNetworkMembership();
            _resultValue.ips = ips;
            _resultValue.resourceId = resourceId;
            _resultValue.resourceType = resourceType;
            return _resultValue;
        }
    }
}
