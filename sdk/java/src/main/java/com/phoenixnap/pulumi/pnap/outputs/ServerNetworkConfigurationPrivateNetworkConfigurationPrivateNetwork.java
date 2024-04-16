// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.outputs;

import com.phoenixnap.pulumi.pnap.outputs.ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkServerPrivateNetwork;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetwork {
    private @Nullable ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkServerPrivateNetwork serverPrivateNetwork;

    private ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetwork() {}
    public Optional<ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkServerPrivateNetwork> serverPrivateNetwork() {
        return Optional.ofNullable(this.serverPrivateNetwork);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkServerPrivateNetwork serverPrivateNetwork;
        public Builder() {}
        public Builder(ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverPrivateNetwork = defaults.serverPrivateNetwork;
        }

        @CustomType.Setter
        public Builder serverPrivateNetwork(@Nullable ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkServerPrivateNetwork serverPrivateNetwork) {

            this.serverPrivateNetwork = serverPrivateNetwork;
            return this;
        }
        public ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetwork build() {
            final var _resultValue = new ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetwork();
            _resultValue.serverPrivateNetwork = serverPrivateNetwork;
            return _resultValue;
        }
    }
}
