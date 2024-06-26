// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SshKeyState extends com.pulumi.resources.ResourceArgs {

    public static final SshKeyState Empty = new SshKeyState();

    @Import(name="createdOn")
    private @Nullable Output<String> createdOn;

    public Optional<Output<String>> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }

    /**
     * Keys marked as default are always included on server creation and reset unless toggled off in creation/reset request.
     * 
     */
    @Import(name="default")
    private @Nullable Output<Boolean> default_;

    /**
     * @return Keys marked as default are always included on server creation and reset unless toggled off in creation/reset request.
     * 
     */
    public Optional<Output<Boolean>> default_() {
        return Optional.ofNullable(this.default_);
    }

    /**
     * SSH key auto-generated SHA-256 fingerprint.
     * * ` createdOn  `- Date and time of creation.
     * * ` lastUpdatedOn  ` - Date and time of last update.
     * 
     */
    @Import(name="fingerprint")
    private @Nullable Output<String> fingerprint;

    /**
     * @return SSH key auto-generated SHA-256 fingerprint.
     * * ` createdOn  `- Date and time of creation.
     * * ` lastUpdatedOn  ` - Date and time of last update.
     * 
     */
    public Optional<Output<String>> fingerprint() {
        return Optional.ofNullable(this.fingerprint);
    }

    /**
     * SSH key actual key value.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return SSH key actual key value.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    @Import(name="lastUpdatedOn")
    private @Nullable Output<String> lastUpdatedOn;

    public Optional<Output<String>> lastUpdatedOn() {
        return Optional.ofNullable(this.lastUpdatedOn);
    }

    /**
     * Friendly SSH key name to represent an SSH key.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Friendly SSH key name to represent an SSH key.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private SshKeyState() {}

    private SshKeyState(SshKeyState $) {
        this.createdOn = $.createdOn;
        this.default_ = $.default_;
        this.fingerprint = $.fingerprint;
        this.key = $.key;
        this.lastUpdatedOn = $.lastUpdatedOn;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SshKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SshKeyState $;

        public Builder() {
            $ = new SshKeyState();
        }

        public Builder(SshKeyState defaults) {
            $ = new SshKeyState(Objects.requireNonNull(defaults));
        }

        public Builder createdOn(@Nullable Output<String> createdOn) {
            $.createdOn = createdOn;
            return this;
        }

        public Builder createdOn(String createdOn) {
            return createdOn(Output.of(createdOn));
        }

        /**
         * @param default_ Keys marked as default are always included on server creation and reset unless toggled off in creation/reset request.
         * 
         * @return builder
         * 
         */
        public Builder default_(@Nullable Output<Boolean> default_) {
            $.default_ = default_;
            return this;
        }

        /**
         * @param default_ Keys marked as default are always included on server creation and reset unless toggled off in creation/reset request.
         * 
         * @return builder
         * 
         */
        public Builder default_(Boolean default_) {
            return default_(Output.of(default_));
        }

        /**
         * @param fingerprint SSH key auto-generated SHA-256 fingerprint.
         * * ` createdOn  `- Date and time of creation.
         * * ` lastUpdatedOn  ` - Date and time of last update.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            $.fingerprint = fingerprint;
            return this;
        }

        /**
         * @param fingerprint SSH key auto-generated SHA-256 fingerprint.
         * * ` createdOn  `- Date and time of creation.
         * * ` lastUpdatedOn  ` - Date and time of last update.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(String fingerprint) {
            return fingerprint(Output.of(fingerprint));
        }

        /**
         * @param key SSH key actual key value.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key SSH key actual key value.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder lastUpdatedOn(@Nullable Output<String> lastUpdatedOn) {
            $.lastUpdatedOn = lastUpdatedOn;
            return this;
        }

        public Builder lastUpdatedOn(String lastUpdatedOn) {
            return lastUpdatedOn(Output.of(lastUpdatedOn));
        }

        /**
         * @param name Friendly SSH key name to represent an SSH key.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Friendly SSH key name to represent an SSH key.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public SshKeyState build() {
            return $;
        }
    }

}
