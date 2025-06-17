<!doctype html>
<html>
<head>
    <title>Feedback Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<nav class="navbar navbar-dark bg-primary">
    <div class="container-fluid">
        <span class="navbar-brand">Feedback Form</span>
    </div>
</nav>

<div class="container mt-5">
    <form action="feedback" method="post" class="p-4 shadow rounded bg-white">
        <div class="mb-3"><label>Name</label><input type="text" name="name" class="form-control" required></div>
        <div class="mb-3"><label>Email</label><input type="email" name="email" class="form-control" required></div>
        <div class="mb-3"><label>Subject</label><input type="text" name="subject" class="form-control"></div>
        <div class="mb-3"><label>Message</label><textarea name="message" class="form-control"></textarea></div>
        <div class="mb-3"><label>City</label><input type="text" name="city" class="form-control"></div>
        <div class="mb-3"><label>State</label><input type="text" name="state" class="form-control"></div>
        <div class="mb-3"><label>Rating (1-10)</label><input type="number" name="rating" min="1" max="10" class="form-control" required></div>
        <div class="form-check mb-3">
            <input class="form-check-input" type="checkbox" name="recommend" value="true">
            <label class="form-check-label">Would you recommend us?</label>
        </div>
        <button type="submit" class="btn btn-success">Submit Feedback</button>
    </form>
</div>

</body>
</html>