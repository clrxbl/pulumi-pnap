// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RancherClusterMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final RancherClusterMetadataArgs Empty = new RancherClusterMetadataArgs();

    /**
     * This is the password to be used to login to the Rancher Server. This field is returned only as a response to the create cluster request. Make sure to take note or you will not be able to access the server.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return This is the password to be used to login to the Rancher Server. This field is returned only as a response to the create cluster request. Make sure to take note or you will not be able to access the server.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The Rancher Server URL.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The Rancher Server URL.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    /**
     * The username to use to login to the Rancher Server. This field is returned only as a response to the create cluster request. Make sure to take note or you will not be able to access the server.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The username to use to login to the Rancher Server. This field is returned only as a response to the create cluster request. Make sure to take note or you will not be able to access the server.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private RancherClusterMetadataArgs() {}

    private RancherClusterMetadataArgs(RancherClusterMetadataArgs $) {
        this.password = $.password;
        this.url = $.url;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RancherClusterMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RancherClusterMetadataArgs $;

        public Builder() {
            $ = new RancherClusterMetadataArgs();
        }

        public Builder(RancherClusterMetadataArgs defaults) {
            $ = new RancherClusterMetadataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password This is the password to be used to login to the Rancher Server. This field is returned only as a response to the create cluster request. Make sure to take note or you will not be able to access the server.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password This is the password to be used to login to the Rancher Server. This field is returned only as a response to the create cluster request. Make sure to take note or you will not be able to access the server.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param url The Rancher Server URL.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The Rancher Server URL.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param username The username to use to login to the Rancher Server. This field is returned only as a response to the create cluster request. Make sure to take note or you will not be able to access the server.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username to use to login to the Rancher Server. This field is returned only as a response to the create cluster request. Make sure to take note or you will not be able to access the server.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public RancherClusterMetadataArgs build() {
            return $;
        }
    }

}