// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServerNetworkConfigurationPublicNetworkConfigurationPublicNetworkServerPublicNetwork {
    /**
     * @return The network identifier.
     * 
     */
    private String id;
    /**
     * @return IPs to configure on the server. IPs must be within the network&#39;s range. Must contain at least 1 item.
     * 
     * The `storage_configuration` block has field `root_partition`.
     * The `root_partition` block has two fields:
     * 
     */
    private List<String> ips;
    private @Nullable String statusDescription;

    private ServerNetworkConfigurationPublicNetworkConfigurationPublicNetworkServerPublicNetwork() {}
    /**
     * @return The network identifier.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return IPs to configure on the server. IPs must be within the network&#39;s range. Must contain at least 1 item.
     * 
     * The `storage_configuration` block has field `root_partition`.
     * The `root_partition` block has two fields:
     * 
     */
    public List<String> ips() {
        return this.ips;
    }
    public Optional<String> statusDescription() {
        return Optional.ofNullable(this.statusDescription);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerNetworkConfigurationPublicNetworkConfigurationPublicNetworkServerPublicNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ips;
        private @Nullable String statusDescription;
        public Builder() {}
        public Builder(ServerNetworkConfigurationPublicNetworkConfigurationPublicNetworkServerPublicNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ips = defaults.ips;
    	      this.statusDescription = defaults.statusDescription;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("ServerNetworkConfigurationPublicNetworkConfigurationPublicNetworkServerPublicNetwork", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ips(List<String> ips) {
            if (ips == null) {
              throw new MissingRequiredPropertyException("ServerNetworkConfigurationPublicNetworkConfigurationPublicNetworkServerPublicNetwork", "ips");
            }
            this.ips = ips;
            return this;
        }
        public Builder ips(String... ips) {
            return ips(List.of(ips));
        }
        @CustomType.Setter
        public Builder statusDescription(@Nullable String statusDescription) {

            this.statusDescription = statusDescription;
            return this;
        }
        public ServerNetworkConfigurationPublicNetworkConfigurationPublicNetworkServerPublicNetwork build() {
            final var _resultValue = new ServerNetworkConfigurationPublicNetworkConfigurationPublicNetworkServerPublicNetwork();
            _resultValue.id = id;
            _resultValue.ips = ips;
            _resultValue.statusDescription = statusDescription;
            return _resultValue;
        }
    }
}
