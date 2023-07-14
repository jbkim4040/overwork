<%--
  Created by IntelliJ IDEA.
  User: gimjeongbin
  Date: 7/10/23
  Time: 11:50 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>인덱스</title>
    <link href="https://unpkg.com/filepond/dist/filepond.css" rel="stylesheet">

    <!-- Add plugin styles -->
    <link href="https://unpkg.com/filepond-plugin-image-preview/dist/filepond-plugin-image-preview.css" rel="stylesheet">

    <script src="https://unpkg.com/filepond-plugin-image-preview/dist/filepond-plugin-image-preview.js"></script>
    <script src="https://unpkg.com/filepond-plugin-image-resize/dist/filepond-plugin-image-resize.js"></script>
    <script src="https://unpkg.com/filepond-plugin-image-transform/dist/filepond-plugin-image-transform.js"></script>

    <!-- add the Image Crop plugin script -->
    <script src="https://unpkg.com/filepond-plugin-image-crop/dist/filepond-plugin-image-crop.js"></script>


    <script src="https://unpkg.com/filepond/dist/filepond.js"></script>

    <script src="https://unpkg.com/filepond/dist/filepond.js"></script>
</head>
<body>
<h1>여긴 인덱스화면</h1>
<input type="file" id="receipt" multiple>


<script>
    FilePond.registerPlugin(
        // register the Image Crop plugin with FilePond
        FilePondPluginImageCrop,
        FilePondPluginImagePreview,
        FilePondPluginImageResize,
        FilePondPluginImageTransform
    );

    const inputElement = document.querySelector('input[type="file"]');
    const pond = FilePond.create(inputElement, {
        // add the Image Crop default aspect ratio
        allowImageCrop: true,
        imageCropAspectRatio: 1,
        imageResizeTargetWidth: 256,
        imageResizeMode: 'contain',
        imageTransformVariants: {
            thumb_medium_: transforms => {
                transforms.resize.size.width = 512;

                // this will be a landscape crop
                transforms.crop.aspectRatio = .5;

                return transforms;
            },
            thumb_small_: transforms => {
                transforms.resize.size.width = 64;
                return transforms;
            }
        },
        onaddfile: (err, fileItem) => {
            console.log(err, fileItem.getMetadata('resize'));
        }
    });
</script>
</body>
</html>
