// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pnap

import (
	"context"
	"reflect"

	"github.com/phoenixnap/pulumi-pnap/sdk/go/pnap/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a phoenixNAP Rancher Cluster datasource. This can be used to read Rancher Server deployment details.
//
// ## Example Usage
//
// Fetch a Rancher Cluster by ID or name and show it's details in alphabetical order.
//
// ```go
// package main
//
// import (
//
//	"github.com/phoenixnap/pulumi-pnap/sdk/go/pnap"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			test, err := pnap.LookupRancherCluster(ctx, &pnap.LookupRancherClusterArgs{
//				Id:   pulumi.StringRef("123"),
//				Name: pulumi.StringRef("Rancher-Deployment-1"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("rancher-cluster", test)
//			return nil
//		})
//	}
//
// ```
func LookupRancherCluster(ctx *pulumi.Context, args *LookupRancherClusterArgs, opts ...pulumi.InvokeOption) (*LookupRancherClusterResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupRancherClusterResult
	err := ctx.Invoke("pnap:index/getRancherCluster:getRancherCluster", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRancherCluster.
type LookupRancherClusterArgs struct {
	// The cluster (Rancher Cluster) identifier.
	Id *string `pulumi:"id"`
	// Cluster name.
	Name *string `pulumi:"name"`
}

// A collection of values returned by getRancherCluster.
type LookupRancherClusterResult struct {
	// Cluster description.
	Description string `pulumi:"description"`
	// The cluster identifier.
	Id string `pulumi:"id"`
	// The Rancher version that was installed on the cluster during the first creation process.
	InitialClusterVersion string `pulumi:"initialClusterVersion"`
	// Deployment location.
	Location string `pulumi:"location"`
	// Connection parameters to use to connect to the Rancher Server Administrative GUI.
	Metadatas []GetRancherClusterMetadata `pulumi:"metadatas"`
	// The name of the node pool.
	Name string `pulumi:"name"`
	// The node pools associated with the cluster.
	NodePools []GetRancherClusterNodePool `pulumi:"nodePools"`
	// The cluster status.
	StatusDescription string `pulumi:"statusDescription"`
}

func LookupRancherClusterOutput(ctx *pulumi.Context, args LookupRancherClusterOutputArgs, opts ...pulumi.InvokeOption) LookupRancherClusterResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupRancherClusterResult, error) {
			args := v.(LookupRancherClusterArgs)
			r, err := LookupRancherCluster(ctx, &args, opts...)
			var s LookupRancherClusterResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupRancherClusterResultOutput)
}

// A collection of arguments for invoking getRancherCluster.
type LookupRancherClusterOutputArgs struct {
	// The cluster (Rancher Cluster) identifier.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// Cluster name.
	Name pulumi.StringPtrInput `pulumi:"name"`
}

func (LookupRancherClusterOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRancherClusterArgs)(nil)).Elem()
}

// A collection of values returned by getRancherCluster.
type LookupRancherClusterResultOutput struct{ *pulumi.OutputState }

func (LookupRancherClusterResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRancherClusterResult)(nil)).Elem()
}

func (o LookupRancherClusterResultOutput) ToLookupRancherClusterResultOutput() LookupRancherClusterResultOutput {
	return o
}

func (o LookupRancherClusterResultOutput) ToLookupRancherClusterResultOutputWithContext(ctx context.Context) LookupRancherClusterResultOutput {
	return o
}

// Cluster description.
func (o LookupRancherClusterResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRancherClusterResult) string { return v.Description }).(pulumi.StringOutput)
}

// The cluster identifier.
func (o LookupRancherClusterResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRancherClusterResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Rancher version that was installed on the cluster during the first creation process.
func (o LookupRancherClusterResultOutput) InitialClusterVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRancherClusterResult) string { return v.InitialClusterVersion }).(pulumi.StringOutput)
}

// Deployment location.
func (o LookupRancherClusterResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRancherClusterResult) string { return v.Location }).(pulumi.StringOutput)
}

// Connection parameters to use to connect to the Rancher Server Administrative GUI.
func (o LookupRancherClusterResultOutput) Metadatas() GetRancherClusterMetadataArrayOutput {
	return o.ApplyT(func(v LookupRancherClusterResult) []GetRancherClusterMetadata { return v.Metadatas }).(GetRancherClusterMetadataArrayOutput)
}

// The name of the node pool.
func (o LookupRancherClusterResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRancherClusterResult) string { return v.Name }).(pulumi.StringOutput)
}

// The node pools associated with the cluster.
func (o LookupRancherClusterResultOutput) NodePools() GetRancherClusterNodePoolArrayOutput {
	return o.ApplyT(func(v LookupRancherClusterResult) []GetRancherClusterNodePool { return v.NodePools }).(GetRancherClusterNodePoolArrayOutput)
}

// The cluster status.
func (o LookupRancherClusterResultOutput) StatusDescription() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRancherClusterResult) string { return v.StatusDescription }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupRancherClusterResultOutput{})
}
