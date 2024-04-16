// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RancherClusterWorkloadConfiguration {
    /**
     * @return Workload cluster location. Cannot be changed once the cluster is created. For a full list of allowed locations visit [API docs](https://developers.phoenixnap.com/docs/rancher/1)
     * 
     */
    private String location;
    /**
     * @return The name of the workload cluster. This field is autogenerated if not provided.
     * 
     */
    private @Nullable String name;
    /**
     * @return Number of configured servers. Currently only server counts of 1 and 3 are possible. Default value is 1.
     * 
     */
    private @Nullable Integer serverCount;
    /**
     * @return Node server type. Cannot be changed once the cluster is created. Default value is &#34;s0.d1.small&#34;. For a full list of allowed values visit [API docs](https://developers.phoenixnap.com/docs/rancher/1)
     * 
     */
    private String serverType;

    private RancherClusterWorkloadConfiguration() {}
    /**
     * @return Workload cluster location. Cannot be changed once the cluster is created. For a full list of allowed locations visit [API docs](https://developers.phoenixnap.com/docs/rancher/1)
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The name of the workload cluster. This field is autogenerated if not provided.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Number of configured servers. Currently only server counts of 1 and 3 are possible. Default value is 1.
     * 
     */
    public Optional<Integer> serverCount() {
        return Optional.ofNullable(this.serverCount);
    }
    /**
     * @return Node server type. Cannot be changed once the cluster is created. Default value is &#34;s0.d1.small&#34;. For a full list of allowed values visit [API docs](https://developers.phoenixnap.com/docs/rancher/1)
     * 
     */
    public String serverType() {
        return this.serverType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RancherClusterWorkloadConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String location;
        private @Nullable String name;
        private @Nullable Integer serverCount;
        private String serverType;
        public Builder() {}
        public Builder(RancherClusterWorkloadConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.serverCount = defaults.serverCount;
    	      this.serverType = defaults.serverType;
        }

        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("RancherClusterWorkloadConfiguration", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder serverCount(@Nullable Integer serverCount) {

            this.serverCount = serverCount;
            return this;
        }
        @CustomType.Setter
        public Builder serverType(String serverType) {
            if (serverType == null) {
              throw new MissingRequiredPropertyException("RancherClusterWorkloadConfiguration", "serverType");
            }
            this.serverType = serverType;
            return this;
        }
        public RancherClusterWorkloadConfiguration build() {
            final var _resultValue = new RancherClusterWorkloadConfiguration();
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.serverCount = serverCount;
            _resultValue.serverType = serverType;
            return _resultValue;
        }
    }
}