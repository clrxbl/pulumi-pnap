// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pnap

import (
	"context"
	"reflect"

	"github.com/phoenixnap/pulumi-pnap/sdk/go/pnap/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a phoenixNAP product availability datasource. This can be used to read product availabilities.
//
// ## Example Usage
//
// Fetch product availabilities by product category, product codes and locations.
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
//			query_1, err := pnap.GetProductAvailability(ctx, &pnap.GetProductAvailabilityArgs{
//				ProductCategories: []string{
//					"SERVER",
//				},
//				ProductCodes: []string{
//					"s1.c1.small",
//					"s1.c1.medium",
//				},
//				Locations: []string{
//					"PHX",
//					"ASH",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("availabilities", query_1.ProductAvailabilities)
//			return nil
//		})
//	}
//
// ```
func GetProductAvailability(ctx *pulumi.Context, args *GetProductAvailabilityArgs, opts ...pulumi.InvokeOption) (*GetProductAvailabilityResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetProductAvailabilityResult
	err := ctx.Invoke("pnap:index/getProductAvailability:getProductAvailability", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProductAvailability.
type GetProductAvailabilityArgs struct {
	// The location code. Currently the following values are allowed: `PHX`, `ASH`, `NLD`, `SGP`, `CHI`, `SEA` and `AUS`.
	Locations []string `pulumi:"locations"`
	// Minimal quantity of product needed. Minimum, maximum and default values might differ for different products. For servers, they are 1, 10 and 1 respectively.
	MinQuantity *float64 `pulumi:"minQuantity"`
	// Product category. Currently only `SERVER` category is supported.
	ProductCategories []string `pulumi:"productCategories"`
	// The code identifying the product. This code has significance across all locations.
	ProductCodes []string `pulumi:"productCodes"`
	// Show only locations where product with requested quantity is available or all locations where product is offered. Default value is `true`.
	ShowOnlyMinQuantityAvailable *bool `pulumi:"showOnlyMinQuantityAvailable"`
	// Currently only the following value is allowed: `SERVER_RANCHER`.
	Solutions []string `pulumi:"solutions"`
}

// A collection of values returned by getProductAvailability.
type GetProductAvailabilityResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The code identifying the location.
	Locations   []string `pulumi:"locations"`
	MinQuantity *float64 `pulumi:"minQuantity"`
	// List of product availabilities.
	ProductAvailabilities []GetProductAvailabilityProductAvailability `pulumi:"productAvailabilities"`
	// The product category.
	ProductCategories []string `pulumi:"productCategories"`
	// The code identifying the product.
	ProductCodes                 []string `pulumi:"productCodes"`
	ShowOnlyMinQuantityAvailable *bool    `pulumi:"showOnlyMinQuantityAvailable"`
	Solutions                    []string `pulumi:"solutions"`
}

func GetProductAvailabilityOutput(ctx *pulumi.Context, args GetProductAvailabilityOutputArgs, opts ...pulumi.InvokeOption) GetProductAvailabilityResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetProductAvailabilityResult, error) {
			args := v.(GetProductAvailabilityArgs)
			r, err := GetProductAvailability(ctx, &args, opts...)
			var s GetProductAvailabilityResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetProductAvailabilityResultOutput)
}

// A collection of arguments for invoking getProductAvailability.
type GetProductAvailabilityOutputArgs struct {
	// The location code. Currently the following values are allowed: `PHX`, `ASH`, `NLD`, `SGP`, `CHI`, `SEA` and `AUS`.
	Locations pulumi.StringArrayInput `pulumi:"locations"`
	// Minimal quantity of product needed. Minimum, maximum and default values might differ for different products. For servers, they are 1, 10 and 1 respectively.
	MinQuantity pulumi.Float64PtrInput `pulumi:"minQuantity"`
	// Product category. Currently only `SERVER` category is supported.
	ProductCategories pulumi.StringArrayInput `pulumi:"productCategories"`
	// The code identifying the product. This code has significance across all locations.
	ProductCodes pulumi.StringArrayInput `pulumi:"productCodes"`
	// Show only locations where product with requested quantity is available or all locations where product is offered. Default value is `true`.
	ShowOnlyMinQuantityAvailable pulumi.BoolPtrInput `pulumi:"showOnlyMinQuantityAvailable"`
	// Currently only the following value is allowed: `SERVER_RANCHER`.
	Solutions pulumi.StringArrayInput `pulumi:"solutions"`
}

func (GetProductAvailabilityOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProductAvailabilityArgs)(nil)).Elem()
}

// A collection of values returned by getProductAvailability.
type GetProductAvailabilityResultOutput struct{ *pulumi.OutputState }

func (GetProductAvailabilityResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProductAvailabilityResult)(nil)).Elem()
}

func (o GetProductAvailabilityResultOutput) ToGetProductAvailabilityResultOutput() GetProductAvailabilityResultOutput {
	return o
}

func (o GetProductAvailabilityResultOutput) ToGetProductAvailabilityResultOutputWithContext(ctx context.Context) GetProductAvailabilityResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetProductAvailabilityResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetProductAvailabilityResult) string { return v.Id }).(pulumi.StringOutput)
}

// The code identifying the location.
func (o GetProductAvailabilityResultOutput) Locations() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetProductAvailabilityResult) []string { return v.Locations }).(pulumi.StringArrayOutput)
}

func (o GetProductAvailabilityResultOutput) MinQuantity() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v GetProductAvailabilityResult) *float64 { return v.MinQuantity }).(pulumi.Float64PtrOutput)
}

// List of product availabilities.
func (o GetProductAvailabilityResultOutput) ProductAvailabilities() GetProductAvailabilityProductAvailabilityArrayOutput {
	return o.ApplyT(func(v GetProductAvailabilityResult) []GetProductAvailabilityProductAvailability {
		return v.ProductAvailabilities
	}).(GetProductAvailabilityProductAvailabilityArrayOutput)
}

// The product category.
func (o GetProductAvailabilityResultOutput) ProductCategories() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetProductAvailabilityResult) []string { return v.ProductCategories }).(pulumi.StringArrayOutput)
}

// The code identifying the product.
func (o GetProductAvailabilityResultOutput) ProductCodes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetProductAvailabilityResult) []string { return v.ProductCodes }).(pulumi.StringArrayOutput)
}

func (o GetProductAvailabilityResultOutput) ShowOnlyMinQuantityAvailable() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetProductAvailabilityResult) *bool { return v.ShowOnlyMinQuantityAvailable }).(pulumi.BoolPtrOutput)
}

func (o GetProductAvailabilityResultOutput) Solutions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetProductAvailabilityResult) []string { return v.Solutions }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetProductAvailabilityResultOutput{})
}
