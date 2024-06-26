// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pnap

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/phoenixnap/pulumi-pnap/sdk/go/pnap/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "pnap:index/ipBlock:IpBlock":
		r = &IpBlock{}
	case "pnap:index/privateNetwork:PrivateNetwork":
		r = &PrivateNetwork{}
	case "pnap:index/publicNetwork:PublicNetwork":
		r = &PublicNetwork{}
	case "pnap:index/rancherCluster:RancherCluster":
		r = &RancherCluster{}
	case "pnap:index/reservation:Reservation":
		r = &Reservation{}
	case "pnap:index/server:Server":
		r = &Server{}
	case "pnap:index/sshKey:SshKey":
		r = &SshKey{}
	case "pnap:index/storageNetwork:StorageNetwork":
		r = &StorageNetwork{}
	case "pnap:index/tag:Tag":
		r = &Tag{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:pnap" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"pnap",
		"index/ipBlock",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pnap",
		"index/privateNetwork",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pnap",
		"index/publicNetwork",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pnap",
		"index/rancherCluster",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pnap",
		"index/reservation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pnap",
		"index/server",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pnap",
		"index/sshKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pnap",
		"index/storageNetwork",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"pnap",
		"index/tag",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"pnap",
		&pkg{version},
	)
}
