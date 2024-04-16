// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RancherClusterMetadata {
    /**
     * @return This is the password to be used to login to the Rancher Server. This field is returned only as a response to the create cluster request. Make sure to take note or you will not be able to access the server.
     * 
     */
    private @Nullable String password;
    /**
     * @return The Rancher Server URL.
     * 
     */
    private @Nullable String url;
    /**
     * @return The username to use to login to the Rancher Server. This field is returned only as a response to the create cluster request. Make sure to take note or you will not be able to access the server.
     * 
     */
    private @Nullable String username;

    private RancherClusterMetadata() {}
    /**
     * @return This is the password to be used to login to the Rancher Server. This field is returned only as a response to the create cluster request. Make sure to take note or you will not be able to access the server.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return The Rancher Server URL.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }
    /**
     * @return The username to use to login to the Rancher Server. This field is returned only as a response to the create cluster request. Make sure to take note or you will not be able to access the server.
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RancherClusterMetadata defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String password;
        private @Nullable String url;
        private @Nullable String username;
        public Builder() {}
        public Builder(RancherClusterMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.url = defaults.url;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder password(@Nullable String password) {

            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {

            this.url = url;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {

            this.username = username;
            return this;
        }
        public RancherClusterMetadata build() {
            final var _resultValue = new RancherClusterMetadata();
            _resultValue.password = password;
            _resultValue.url = url;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}